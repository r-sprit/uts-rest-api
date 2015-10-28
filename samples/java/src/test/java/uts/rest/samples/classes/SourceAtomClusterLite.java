package uts.rest.samples.classes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"classType","sourceUi","memberships","attributes"})

public class SourceAtomClusterLite {

	
	private String ui;
	private String name;
	private boolean obsolete;
	private boolean suppressible;
	private String rootSource;
	private int cVMemberCount;
	private int atomCount;
	private String atoms;
	private String parents;
	private String children;
    private String descendants;
    private String ancestors;
	private String relations;
	private String definitions;
	
	
	public String getUi() {
		
		return this.ui;
	}
	
	public String getName() {
		
		return this.name;
	}
	
	public boolean getObsolete() {
		
		return this.obsolete;
	}
	
	public boolean getSuppressible() {
		
		return this.suppressible;
	}
	
	public String getAtoms() {
		
		return this.atoms;
	}
	
	public String getRootSource() {
		
		return this.rootSource;
	}
	
	public int getAtomCount() {
		
		return this.atomCount;
	}
	
	public int getCVMemberCount() {
		
		return this.cVMemberCount;
	}
     
	public String getParents() {
		
		return this.parents;
	}

	public String getChildren() {
		
		return this.children;
	}
	
	public String getAncestors() {
		
		return this.ancestors;
		
	}
	
	public String getDescendants() {
		
		return this.descendants;
	}
	
	public String getDefinitions() {
		
		return this.definitions;
	}
	
	public String getRelations() {
		
		return this.relations;
	}
	
	private void setAtoms(String atoms) {
		
		this.atoms = atoms;
	}
	
	private void setAtomCount(int atomCount) {
		
		this.atomCount = atomCount;
	}
	
	private void setcVMemberCount(int cVMemberCount) {
		
		this.cVMemberCount = cVMemberCount;
	}
	
	private void setUi(String ui) {
		
		this.ui = ui;
	}
	
	private void setName(String name){
		
		this.name=name;
	}
	
	private void setRootSource(String rootSource) {
		
		this.rootSource = rootSource;
	}
	
	private void setObsolete(boolean obsolete) {
		
		this.obsolete = obsolete;
	}
	
	private void setSuppressible(boolean suppressible) {
		
		this.suppressible = suppressible;
	}
	
	private void setDefinitions (String definitions) {
		
		this.definitions = definitions;
	}
	
	private void setRelations (String relations) {
		
		this.relations = relations;
	}
	
	private void setChildren(String children) {
		
		this.children = children;
	}
	
	
	private void setParents(String parents) {
		
		this.parents = parents;
	}
	
	private void setAncesotrs(String ancestors)  {
		
		this.ancestors = ancestors;
	}
}
