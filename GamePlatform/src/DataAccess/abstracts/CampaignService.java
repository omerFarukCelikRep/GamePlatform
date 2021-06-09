package DataAccess.abstracts;

import java.util.List;

import Entities.concretes.Campaign;

public interface CampaignService {
	void add(Campaign campaign);
	void update(Campaign campaign);
	void delete(Campaign campaign);
	Campaign get(int id);
	List<Campaign> getAll();
}
