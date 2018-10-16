/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cau1;

/**
 *
 * @author CCNE
 */
public class CamSanh extends HoaQua{
    
    String Loaicam;

	public String getLoaicam() {
		return this.Loaicam;
	}

	public void setLoaicam(String loaicam) {
		this.Loaicam = loaicam;
	}

	public void showInfor() {
		super.showInfor();
		System.out.println("Loai cam :" + this.getLoaicam());
	}
    
}
