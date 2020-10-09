package State_Wise_Total;

public class GetData {
	String state;
	String district;
	int maletotal;
	int femaletotal;

	public void setState(String state) {
		this.state = state;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public void setMaleTotal(Integer maletotal) {
		this.maletotal = maletotal;
	}

	public void setFemaleTotal(Integer femaletotal) {
		this.femaletotal = femaletotal;
	}

	public String getState() {
		return state;
	}

	public String getDistrict() {
		return district;
	}

	public Integer getMaleTotal() {
		return maletotal;
	}

	public Integer getFemaleTotal() {
		return femaletotal;
	}

}
