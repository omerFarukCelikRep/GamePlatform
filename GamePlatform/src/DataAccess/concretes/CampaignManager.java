package DataAccess.concretes;

import java.util.List;

import DataAccess.abstracts.CampaignService;
import Entities.concretes.Campaign;

public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println("Kampanya Eklendi " + campaign.getName());
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Kampanya Güncellendi " + campaign.getName());
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Kampanya Silindi " + campaign.getName());
		
	}

	@Override
	public Campaign get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Campaign> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
