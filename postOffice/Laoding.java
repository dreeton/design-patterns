package postOffice;

public abstract class Laoding {
	
	public static final int START = 1;
    public static final int END = 2;
    public static final int MIDLE = 3;

    protected int level;
    protected Laoding secLaoding;
    
    	public void secLaoding(Laoding secLaoding){
    		this.secLaoding = secLaoding;
    	}

    	public void LoadInfo(int level, String inf){
    		if (this.level <= level){
    			this.writeInf(inf);
    		}else if (this.secLaoding != null) {
    			this.secLaoding.LoadInfo(level, inf);
    		}
    	}

    protected abstract void writeInf(String inf);
}

