

public class ServerController {
protected ArrayList<Object> serverList = new ArrayList();

public void registerServerCB(Object hash){
serverList.add(hash);
}

public ArrayList<Object> getServers(){
return serverList;
}

public Object getServer(String IP){

for(Object object : serverList){

String servIP = ((Server)object).getIP();

if(IP.contains(servIP){

return object;

}

}

}



}
