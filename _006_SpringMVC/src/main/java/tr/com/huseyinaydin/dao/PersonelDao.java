package tr.com.huseyinaydin.dao;

import org.springframework.stereotype.Repository;

import tr.com.huseyinaydin.model.Personel;

//بسم الله الرحمن الرحيم
/**
*
* @author Huseyin_Aydin
* @since 1994
* @category Spring MVC
*
*/

@Repository
public class PersonelDao implements IPersonelDao {

	@Override
	public String getPersonelAdi() {
		return null;
	}

	@Override
	public Personel getPersonelGuncelle(Personel personel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean getPersonelBilgisi(int personelId) {
		// TODO Auto-generated method stub
		return false;
	}
}