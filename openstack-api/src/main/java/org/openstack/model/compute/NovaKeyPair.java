package org.openstack.model.compute;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.openstack.model.common.JsonRootElement;

import com.google.gson.annotations.SerializedName;

// TODO: Rename to KeyPairInfo?

@XmlRootElement(name="keypair", namespace="")
@XmlAccessorType(XmlAccessType.NONE)
@JsonRootElement("keypair")
public class NovaKeyPair implements Serializable {
	
	@XmlElement(required=true, namespace="")
	private String name;
	
	@XmlElement(name="public_key", namespace="")
	@SerializedName("public_key")
	private String publicKey;
	
	@XmlElement(namespace="")
	private String fingerprint;

	@XmlElement(name="user_id")
	@SerializedName("user_id")
	private String userId;
	
	@XmlElement(name="private_key")
	@SerializedName("private_key")
	private String privateKey;
	
	public NovaKeyPair() {
		// TODO Auto-generated constructor stub
	}
	
	public NovaKeyPair(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPublicKey() {
		return publicKey;
	}

	public void setPublicKey(String publicKey) {
		this.publicKey = publicKey;
	}

	public String getFingerprint() {
		return fingerprint;
	}

	public void setFingerprint(String fingerprint) {
		this.fingerprint = fingerprint;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "KeyPair [name=" + name + ", publicKey=" + publicKey
				+ ", fingerprint=" + fingerprint + "]";
	}

	public String getPrivateKey() {
		return privateKey;
	}

	public void setPrivateKey(String privateKey) {
		this.privateKey = privateKey;
	}
	
}
