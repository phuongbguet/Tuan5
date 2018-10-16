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
public class QuaCam extends HoaQua{

    public QuaCam() {
        super();
    }
    
    
    String vi;
	public String getVi() {
            this.nguongoc = "";
		return vi;
	}
	public void setVi(String vi) {
		this.vi = vi;
	}
	public void showInfor() {
		super.showInfor();
		System.out.println("Vi:"+this.getVi());
	}
    
}
