package com.bium.DTO;

public class BiumDTO {
	private int BNO;
	private String BNAME;
	private String BGRAM;
	private int SAL;
	private String IMG;
	
	public BiumDTO() {
	}
	
	public BiumDTO(int bNO, String bNAME, String bGRAM, int sAL, String iMG) {
		super();
		BNO = bNO;
		BNAME = bNAME;
		BGRAM = bGRAM;
		SAL = sAL;
		IMG = iMG;
	}

	public int getBNO() {
		return BNO;
	}

	public void setBNO(int bNO) {
		BNO = bNO;
	}

	public String getBNAME() {
		return BNAME;
	}

	public void setBNAME(String bNAME) {
		BNAME = bNAME;
	}
	

	public String getBGRAM() {
		return BGRAM;
	}

	public void setBGRAM(String bGRAM) {
		BGRAM = bGRAM;
	}

	public int getSAL() {
		return SAL;
	}

	public void setSAL(int sAL) {
		SAL = sAL;
	}

	public String getIMG() {
		return IMG;
	}

	public void setIMG(String iMG) {
		IMG = iMG;
	}
	

}
