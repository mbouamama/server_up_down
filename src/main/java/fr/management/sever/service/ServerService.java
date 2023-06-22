package fr.management.sever.service;

import fr.management.sever.model.Server;

import java.io.IOException;
import java.net.UnknownHostException;
import java.util.Collection;

public interface ServerService {

    Server create(Server server);

    Server ping(String ipAddress) throws IOException;

    Collection<Server> list(int limit);

    Server get(Server server);

    Server update(Server server);

    Boolean delete(Long id);



}
