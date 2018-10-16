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
public class QuaTao extends HoaQua{
    
    String Loaitao;

	public String getLoaitao() {
		return Loaitao;
	}

	public void setLoaitao(String loaitao) {
		Loaitao = loaitao;
	}

	public void showInfor() {
		super.showInfor();
		System.out.println("Loai tao:" + this.getLoaitao());
	}
    
}
