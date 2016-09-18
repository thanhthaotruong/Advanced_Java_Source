package Ex7_2;
/*
 * Author: Thanh Thao
 * Date : 15 Sept 2016
 * Version 1.0
 */
public class Employee {
	int id;
	String ho_ten;
	int gioi_tinh;
	String ngay_sinh;
	int muc_luong;
	String dia_chi;
	int id_don_vi;

	public Employee(int id, String ho_ten, int gioi_tinh,String ngay_sinh, int muc_luong,
			String dia_chi, int id_don_vi) {
		this.id = id;
		this.ho_ten = ho_ten;
		this.gioi_tinh = gioi_tinh;
		this.ngay_sinh = ngay_sinh;
		this.muc_luong = muc_luong;
		this.dia_chi = dia_chi;
		this.id_don_vi = id_don_vi;
	}

	public Employee() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getHo_ten() {
		return ho_ten;
	}

	public void setHo_ten(String ho_ten) {
		this.ho_ten = ho_ten;
	}

	public int getGioi_tinh() {
		return gioi_tinh;
	}

	public void setGioi_tinh(int gioi_tinh) {
		this.gioi_tinh = gioi_tinh;
	}

	public int getMuc_luong() {
		return muc_luong;
	}

	public void setMuc_luong(int muc_luong) {
		this.muc_luong = muc_luong;
	}

	public String getDia_chi() {
		return dia_chi;
	}

	public void setDia_chi(String dia_chi) {
		this.dia_chi = dia_chi;
	}

	public int getId_don_vi() {
		return id_don_vi;
	}

	public void setId_don_vi(int id_don_vi) {
		this.id_don_vi = id_don_vi;
	}
	
	public String getNgay_sinh() {
		return ngay_sinh;
	}

	public void setNgay_sinh(String ngay_sinh) {
		this.ngay_sinh = ngay_sinh;
	}

	@Override
	public String toString() {
		return "ID: "+id+" - "+"Name: "+ho_ten+" - "+"Sex: "+gioi_tinh+" - "+"Date Of Birth: "+ngay_sinh
				+" - "+"Salary: "+muc_luong+" - "+"Address: "+dia_chi+" - "+"Unit: "+id_don_vi+"\n";
	}
}
