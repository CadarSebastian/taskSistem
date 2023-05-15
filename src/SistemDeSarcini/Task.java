package SistemDeSarcini;

public abstract class Task {
int timp;

public Task(int timp) {
	this.timp = timp;
}

 public int getTimp() {
	return timp;
}

public void setTimp(int timp) {
	this.timp = timp;
}

public  int executa() {
	 return timp;
 }
 
}
