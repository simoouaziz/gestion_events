package ma.emsi.servicelmpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import ma.emsi.model.MoyenDeTransport;
import ma.emsi.repository.MoyenDeTransportRepository;
import ma.emsi.service.MoyenDeTransportService;

public class MoyenDeTransportServiceImpl implements MoyenDeTransportService{
	
	@Autowired
    private MoyenDeTransportRepository moyenDeTransportRepository;
	
	 @Override
	    public List<MoyenDeTransport> getMoyenDeTransportByType(String type) {
	        return moyenDeTransportRepository.findByType(type);
	    }

	    @Override
	    public List<MoyenDeTransport> getUnusedTransports() {
	    	return null;
	        //return moyenDeTransportRepository.findUnusedTransports();
	    }

}
