package ma.emsi.service;

import java.util.List;

import ma.emsi.model.MoyenDeTransport;

public interface MoyenDeTransportService {
	 List<MoyenDeTransport> getMoyenDeTransportByType(String type);
	    List<MoyenDeTransport> getUnusedTransports();

}
