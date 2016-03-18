package com.crazykid080.main.userControl;


public int subCoreNum =-1;
protected boolean isMainCore = false;

public class Core extends Server{

public Core(){

isMainCore = true;

IPAddress = IPController.obtainIP(this);


}

public Core(Core parent){

int num = parent.getsubCoreNum();
subCoreNum = num + 1;

IPAddress = IPController.obtainIP(this);

}



//getters and setters below

public int getsubCoreNum(){
return subCoreNum;
}

}
