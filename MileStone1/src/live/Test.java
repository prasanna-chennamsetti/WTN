package live;
import music1.Playable;
import music.string.Veena;
import music.wind.Saxophone;
public class Test {
	public static void main(String[] args) {
	Veena v=new Veena();
	Saxophone s=new Saxophone();
	Playable pv,ps;
	pv=new Veena();
	ps=new Saxophone();
	pv.play();
	ps.play();
	v.play();
	s.play();
}
}
