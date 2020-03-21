package xbdd.model.junit;

import xbdd.model.simple.Tag;

import java.util.List;

public class JUnitElement {
	private Integer line;
	private String name;
	private String description;
	private String id;
	private String type;
	private String keyword;
	private List<JUnitStep> steps;
	private List<Tag> tags;

	public Integer getLine() {
		return line;
	}

	public void setLine(Integer line) {
		this.line = line;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public List<JUnitStep> getSteps() {
		return steps;
	}

	public void setSteps(List<JUnitStep> steps) {
		this.steps = steps;
	}

	public List<Tag> getTags() {
		return tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}
}

/*
Example

{
"line": 13,
"name": "Test state",
"description": "",
"id": "a-basic-cucumber-example;test-state;rainbow-colours;3",
"type": "scenario",
"keyword": "Scenario Outline",
"steps": [
  {
	"result": {
	  "status": "undefined"
	},
	"line": 8,
	"name": "passing without a table",
	"match": {},
	"matchedColumns": [
	  0
	],
	"keyword": "Given "
  },
  {
	"result": {
	  "status": "undefined"
	},
	"line": 9,
	"name": "passing without a table",
	"match": {},
	"matchedColumns": [
	  1
	],
	"keyword": "Given "
  }
]
},
 */