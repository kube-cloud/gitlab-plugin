package com.dabsquared.gitlabjenkins.gitlab.api.model;

import net.karneim.pojobuilder.GeneratePojoBuilder;

import com.fasterxml.jackson.annotation.JsonProperty;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * TAG Informations 
 * @author <a href="mailto:jetune@kube-cloud.com">Jean-Jacques ETUNE NGI (Java EE Technical Lead / Enterprise Architect)</a>
 * @since Mon, 2022-08-15 - 21:32:16
 */
@GeneratePojoBuilder(intoPackage = "*.builder.generated", withFactoryMethod = "*")
public class Tag {
	
	/**
	 * TAG Name
	 */
	private String name;
	
	/**
	 * TAG Message
	 */
	private String message;
	
	/**
	 * TAG Commit Target
	 */
	private String target;
	
	/**
	 * TAG Protected Flag
	 */
	@JsonProperty("protected")
	private Boolean protectedTag;
	
	/**
	 * TAG Commit
	 */
	private Commit commit;
	
	/**
	 * Getter method for field "name"
	 * @return Field value "name"
	 */
	public String getName() {
	
		// Return field value
		return name;
	}

	/**
	 * Setter method for field "name"
	 * @param name New field value "name"
	 */
	public void setName(String name) {
	
		// Initialize field
		this.name = name;
	}

	/**
	 * Getter method for field "message"
	 * @return Field value "message"
	 */
	public String getMessage() {
	
		// Return field value
		return message;
	}

	/**
	 * Setter method for field "message"
	 * @param message New field value "message"
	 */
	public void setMessage(String message) {
	
		// Initialize field
		this.message = message;
	}

	/**
	 * Getter method for field "target"
	 * @return Field value "target"
	 */
	public String getTarget() {
	
		// Return field value
		return target;
	}

	/**
	 * Setter method for field "target"
	 * @param target New field value "target"
	 */
	public void setTarget(String target) {
	
		// Initialize field
		this.target = target;
	}

	/**
	 * Getter method for field "protectedTag"
	 * @return Field value "protectedTag"
	 */
	public Boolean getProtectedTag() {
	
		// Return field value
		return protectedTag;
	}

	/**
	 * Setter method for field "protectedTag"
	 * @param protectedTag New field value "protectedTag"
	 */
	public void setProtectedTag(Boolean protectedTag) {
	
		// Initialize field
		this.protectedTag = protectedTag;
	}

	/**
	 * Getter method for field "commit"
	 * @return Field value "commit"
	 */
	public Commit getCommit() {
	
		// Return field value
		return commit;
	}

	/**
	 * Setter method for field "commit"
	 * @param commit New field value "commit"
	 */
	public void setCommit(Commit commit) {
	
		// Initialize field
		this.commit = commit;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Tag branch = (Tag) o;
		return new EqualsBuilder()
				.append(name, branch.name)
				.append(target, branch.target)
				.append(message, branch.message)
				.append(commit, branch.commit)
				.isEquals();
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return new HashCodeBuilder(17, 37)
				.append(name)
				.append(target)
				.append(message)
				.append(commit)
				.toHashCode();
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return new ToStringBuilder(this)
				.append("name", name)
				.append("target", target)
				.append("message", message)
				.append("commit", commit)
				.toString();
	}
}
