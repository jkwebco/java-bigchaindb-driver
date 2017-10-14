package com.authenteq.model;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.authenteq.annotations.Exclude;
import com.google.gson.annotations.SerializedName;

public class Transaction {

	@SerializedName("asset")
	private Asset asset = null;

	@SerializedName("id")
	private String id;

	@SerializedName("inputs")
	private List<Input> inputs = new ArrayList<Input>();

	@SerializedName("metadata")
	private Map<String,String> metaData = new LinkedHashMap<String,String>();

	@SerializedName("operation")
	private String operation;

	@SerializedName("outputs")
	private List<Output> outputs = new ArrayList<Output>();

	@SerializedName("version")
	private String version;

	@Exclude
	private Boolean signed;

	public Boolean getSigned() {
		return signed;
	}

	public void setSigned(Boolean signed) {
		this.signed = signed;
	}

	public Asset getAsset() {
		return asset;
	}

	public void setAsset(Asset asset) {
		this.asset = asset;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<Input> getInputs() {
		return inputs;
	}

	public void setInputs(List<Input> inputs) {
		this.inputs = inputs;
	}

	public Map<String,String> getMetaData() {
		return metaData;
	}

	public void setMetaData(Map<String,String> metaData) {
		this.metaData = metaData;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public List<Output> getOutputs() {
		return outputs;
	}

	public void setOutputs(List<Output> outputs) {
		this.outputs = outputs;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}
	
	public void addInput(Input input) {
		this.inputs.add(input);
	}
	
	public void addOutput(Output output) {
		this.outputs.add(output);
	}
	

}
