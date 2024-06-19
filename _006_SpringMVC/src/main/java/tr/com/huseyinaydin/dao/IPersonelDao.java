package tr.com.huseyinaydin.dao;

import tr.com.huseyinaydin.model.Personel;

//بسم الله الرحمن الرحيم
/**
*
* @author Huseyin_Aydin
* @since 1994
* @category Spring MVC
*
*/

public interface IPersonelDao {
	public String getPersonelAdi();
	public Personel getPersonelGuncelle(Personel personel);	
	public boolean getPersonelBilgisi(int personelId);
}