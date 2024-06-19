package tr.com.huseyinaydin.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import tr.com.huseyinaydin.model.Personel;

//بسم الله الرحمن الرحيم
/**
*
* @author Huseyin_Aydin
* @since 1994
* @category Spring MVC
*
*/

@Service
public class PersonelServis implements IPersonelServis {

	@Inject
	PersonelServis personelDao;

	@Override
	public String getPersonelAdi() {
		return personelDao.getPersonelAdi();
	}

	@Override
	public Personel getPersonelGuncelle(Personel personel) {
		return null;
	}

	@Override
	public boolean getPersonelBilgisi(int personelId) {
		return false;
	}
}