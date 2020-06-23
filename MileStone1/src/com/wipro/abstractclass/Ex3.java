package com.wipro.abstractclass;
abstract class Instrument
{
	abstract void play();
}
class Piano extends Instrument
{
	void play() {
		System.out.println("Piano is playing tan tan tan");
	}
}
class Flute extends Instrument{
	void play() {
		System.out.println("Flute is playing Toot toot toot");
	}
}
class Guitar extends Instrument{
	void play() {
		System.out.println("Guitar is playing Tin tin tin");
	}
}
public class Ex3 {
	public static void main(String args[]) {
		Instrument []in=new Instrument[10];
		for(int i=0;i<3;i++) {
			in[i]=new Piano();
			in[i].play();
		}
		for(int i=3;i<7;i++) {
			in[i]=new Flute();
			in[i].play();
		}
		for(int i=7;i<10;i++) {
			in[i]=new Guitar();
			in[i].play();
		}
		for(int i=0;i<10;i++) {
			if(in[i] instanceof Piano) {
				System.out.println(i+" Piano Object");
			}
			else if(in[i] instanceof Flute) {
				System.out.println(i+" Flute Object");
			}
			else
			{
				System.out.println(i+" Guitar Object");
			}
		}
	}
}
