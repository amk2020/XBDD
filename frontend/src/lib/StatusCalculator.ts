import Status from 'models/Status';
import Step from 'models/Step';
import Feature from 'models/Feature';

type ScenarioDetails = {
  backgroundSteps: Step[];
  steps: Step[];
};

export const calculateFeatureStatus = (feature: Feature): Status => {
  const STATUS_PRIORITY_ORDER = [Status.Failed, Status.Undefined, Status.Skipped, Status.Passed];
  const scenarioStatuses = feature.scenarios.map(scenario => scenario.calculatedStatus || scenario.originalAutomatedStatus);
  const featureStatus = STATUS_PRIORITY_ORDER.find(status => scenarioStatuses.includes(status));
  if (featureStatus) {
    return featureStatus;
  }
  return Status.Passed;
};

export const calculateManualStatus = (scenario: ScenarioDetails): Status => {
  if (scenario.backgroundSteps) {
    const notPassedBgStep = scenario.backgroundSteps.find(step =>
      step.manualStatus ? step.manualStatus !== Status.Passed : step.status !== Status.Passed
    );
    if (notPassedBgStep) {
      return notPassedBgStep.manualStatus ? notPassedBgStep.manualStatus : notPassedBgStep.status;
    }
  }
  if (scenario.steps) {
    const notPassedStep = scenario.steps.find(step =>
      step.manualStatus ? step.manualStatus !== Status.Passed : step.status !== Status.Passed
    );
    if (notPassedStep) {
      return notPassedStep.manualStatus ? notPassedStep.manualStatus : notPassedStep.status;
    }
  }
  return Status.Passed;
};

export const calculateAutoStatus = (scenario: ScenarioDetails): Status => {
  if (scenario.backgroundSteps) {
    const notPassedBgStep = scenario.backgroundSteps.find(step => step.status !== Status.Passed);
    if (notPassedBgStep) {
      return notPassedBgStep.status;
    }
  }
  if (scenario.steps) {
    const notPassedStep = scenario.steps.find(step => step.status !== Status.Passed);
    if (notPassedStep) {
      return notPassedStep.status;
    }
  }
  return Status.Passed;
};
