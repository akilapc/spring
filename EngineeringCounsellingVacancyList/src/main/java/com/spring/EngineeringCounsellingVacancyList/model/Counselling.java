package com.spring.EngineeringCounsellingVacancyList.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "EngineeringCounsellingVacancyList")

public class Counselling {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int SERIALNO;
	private int CLGCODE;
	private String CLGNAME;
	private String BRANCHNAME;
	private int OC;
	private int BC;
	private int BCM;
	private int MBC;
	private int MBCDNC;
	private int MBCV;
	private int SC;
	private int SCA;
	private int ST;
	
	public int getCLGCODE() {
		return CLGCODE;
	}
	public void setCLGCODE(int cLGCODE) {
		CLGCODE = cLGCODE;
	}
	public String getCLGNAME() {
		return CLGNAME;
	}
	public void setCLGNAME(String cLGNAME) {
		CLGNAME = cLGNAME;
	}
	public String getBRANCHNAME() {
		return BRANCHNAME;
	}
	public void setBRANCHNAME(String bRANCHNAME) {
		BRANCHNAME = bRANCHNAME;
	}
	public int getOC() {
		return OC;
	}
	public void setOC(int oC) {
		OC = oC;
	}
	public int getBC() {
		return BC;
	}
	public void setBC(int bC) {
		BC = bC;
	}
	public int getBCM() {
		return BCM;
	}
	public void setBCM(int bCM) {
		BCM = bCM;
	}
	public int getMBC() {
		return MBC;
	}
	public void setMBC(int mBC) {
		MBC = mBC;
	}
	public int getMBCDNC() {
		return MBCDNC;
	}
	public void setMBCDNC(int mBCDNC) {
		MBCDNC = mBCDNC;
	}
	public int getMBCV() {
		return MBCV;
	}
	public void setMBCV(int mBCV) {
		MBCV = mBCV;
	}
	public int getSC() {
		return SC;
	}
	public void setSC(int sC) {
		SC = sC;
	}
	public int getSCA() {
		return SCA;
	}
	public void setSCA(int sCA) {
		SCA = sCA;
	}
	public int getST() {
		return ST;
	}
	public void setST(int sT) {
		ST = sT;
	}
	public int getSERIALNO() {
		return SERIALNO;
	}
	public void setSERIALNO(int sERIALNO) {
		SERIALNO = sERIALNO;
	}
	@Override
	public String toString() {
		return "Counselling [SERIALNO=" + SERIALNO + ", CLGCODE=" + CLGCODE + ", CLGNAME=" + CLGNAME + ", BRANCHNAME="
				+ BRANCHNAME + ", OC=" + OC + ", BC=" + BC + ", BCM=" + BCM + ", MBC=" + MBC + ", MBCDNC=" + MBCDNC
				+ ", MBCV=" + MBCV + ", SC=" + SC + ", SCA=" + SCA + ", ST=" + ST + "]";
	}
	
	
	
	
	

}
