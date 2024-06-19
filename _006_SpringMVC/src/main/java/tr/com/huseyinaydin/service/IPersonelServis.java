package tr.com.huseyinaydin.service;

import tr.com.huseyinaydin.model.Personel;

//بسم الله الرحمن الرحيم
/**
*
* @author Huseyin_Aydin
* @since 1994
* @category Spring MVC
*
*/

public interface IPersonelServis {
	public String getPersonelAdi();
	public Personel getPersonelGuncelle(Personel personel);
	public boolean getPersonelBilgisi(int personelId);
}