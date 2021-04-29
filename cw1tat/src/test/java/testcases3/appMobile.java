package testcases3;

import java.util.List;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Key;
import org.sikuli.script.Location;
import org.sikuli.script.Match;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class appMobile {

	static String PATH = "D:\\zajęcia zdalne\\TATWin\\ćw\\appmobile\\";
	static Pattern START = new Pattern(PATH + "start.png");
	static Pattern ANDROID = new Pattern(PATH + "android.png");
	static Pattern ACTION = new Pattern(PATH + "action1.png");
	static Pattern HOME = new Pattern (PATH + "home.png");
	static Pattern MENU = new Pattern (PATH + "menu.png");
	static Pattern FUNKCJE = new Pattern (PATH + "funkcje.png");
	static Pattern TOHOME = new Pattern (PATH + "funkcje.png");
	static Pattern JEDEN = new Pattern(PATH + "calc.png");
	static Pattern DWA = new Pattern(PATH + "calc.png");
	static Pattern TRZY = new Pattern(PATH + "calc.png");
	static Pattern CZTERY = new Pattern(PATH + "calc.png");
	static Pattern PIEC = new Pattern(PATH + "calc.png");
	static Pattern SZESC = new Pattern(PATH + "calc.png");
	static Pattern SIEDEM = new Pattern(PATH + "calc.png");
	static Pattern OSIEM = new Pattern(PATH + "calc.png");
	static Pattern DZIEWIEC = new Pattern(PATH + "calc.png");
	static Pattern ZERO = new Pattern(PATH + "calc.png");
	static Pattern DODAJ = new Pattern(PATH + "calc.png");
	static Pattern ODEJ = new Pattern(PATH + "calc.png");
	static Pattern MNOZ = new Pattern(PATH + "calc.png");
	static Pattern DZIEL = new Pattern(PATH + "calc.png");
	static Pattern WYNIK = new Pattern(PATH + "calc.png");
	static Pattern PROCENT = new Pattern(PATH + "calc.png");
	static Pattern CLEAR = new Pattern(PATH + "clear.png");
	
	public static void main (String[] args) throws FindFailed, InterruptedException{
		Screen scr = new Screen(0);
		Match start = scr.find(START.targetOffset(10,10));
		scr.click(start);
		scr.type("android studio");
		scr.type(Key.ENTER);
		Thread.sleep(8000);
		
		Match android = scr.find(ANDROID.targetOffset(202,224));
		scr.click(android);
		scr.type(Key.ENTER);
		Thread.sleep(2000);
		
		Match action = scr.find(ACTION.targetOffset(475,-47).similar(0.9));
		scr.click(action);
		Thread.sleep(10000);
		
		Match tohome = scr.find(TOHOME.targetOffset(0,137).similar(0.9));
		scr.click(tohome);
		Thread.sleep(3000);
		
		Match home = scr.find(HOME.targetOffset(0,204).similar(0.9));
		scr.click(home);
		Thread.sleep(2000);
		
		Match menu = scr.find(MENU.targetOffset(-77,-219).similar(0.9));
		scr.click(menu);
		Thread.sleep(2000);
		
		Match funkcje = scr.find(FUNKCJE.targetOffset(-2,-37).similar(0.9));
		scr.click(funkcje);
		Thread.sleep(2000);
		
		// 1 działąnie 
		Match jeden = scr.find(JEDEN.targetOffset(-249,100).similar(0.9));
		scr.click(jeden);
		Thread.sleep(2000);
		
		Match piec = scr.find(PIEC.targetOffset(-168,45).similar(0.9));
		scr.click(piec);
		Thread.sleep(1000);
		
		Match mnoz = scr.find(MNOZ.targetOffset(4,45).similar(0.9));
		scr.click(mnoz);
		Thread.sleep(1000);
		
		Match jeden1 = scr.find(JEDEN.targetOffset(-249,100).similar(0.9));
		scr.click(jeden1);
		Thread.sleep(1000);
		
		Match trzy = scr.find(TRZY.targetOffset(-88,101).similar(0.9));
		scr.click(trzy);
		Thread.sleep(1000);
		
		Match wynik = scr.find(WYNIK.targetOffset(72,155).similar(0.9));
		scr.click(wynik);
		Thread.sleep(1000);
		
		Match clear = scr.find(CLEAR.targetOffset(0,0).similar(0.9));
		scr.click(clear);
		Thread.sleep(1000);
		
		//2 dzioałamie
		Match dwa = scr.find(DWA.targetOffset(-168,98).similar(0.9));
		scr.click(dwa);
		Thread.sleep(1000);
		
		Match osiem = scr.find(OSIEM.targetOffset(-168,-14).similar(0.9));
		scr.click(osiem);
		Thread.sleep(1000);
		
		Match dodaj = scr.find(DODAJ.targetOffset(3,156).similar(0.9));
		scr.click(dodaj);
		Thread.sleep(1000);
		
		Match cztery = scr.find(CZTERY.targetOffset(-249,45).similar(0.9));
		scr.click(cztery);
		Thread.sleep(1000);
		
		Match dziewiec = scr.find(DZIEWIEC.targetOffset(-88,-13).similar(0.9));
		scr.click(dziewiec);
		Thread.sleep(1000);
		
		Match wynik1 = scr.find(WYNIK.targetOffset(72,155).similar(0.9));
		scr.click(wynik1);
		Thread.sleep(1000);
		
		Match clear1 = scr.find(CLEAR.targetOffset(0,0).similar(0.9));
		scr.click(clear1);
		Thread.sleep(1000);
		
		//3 działąnioe
		Match szesc = scr.find(SZESC.targetOffset(-540,-6).similar(0.9));
		scr.click(jeden);
		Thread.sleep(1000);
		
		Match minus = scr.find(ODEJ.targetOffset(7,100).similar(0.9));
		scr.click(minus);
		Thread.sleep(1000);
		
		Match siedem = scr.find(SIEDEM.targetOffset(-250,-11).similar(0.9));
		scr.click(siedem);
		Thread.sleep(1000);
		
		Match procent = scr.find(PROCENT.targetOffset(296,-16).similar(0.9));
		scr.click(procent);
		Thread.sleep(1000);
		
		Match wynik2 = scr.find(WYNIK.targetOffset(72,155).similar(0.9));
		scr.click(wynik2);
		Thread.sleep(1000);
		
		Match clear2 = scr.find(CLEAR.targetOffset(0,0).similar(0.9));
		scr.click(clear2);
		Thread.sleep(1000);
		
		Match tohome1 = scr.find(TOHOME.targetOffset(0,137).similar(0.9));
		scr.click(tohome1);
		Thread.sleep(1000);
		
		Match funkcje1 = scr.find(FUNKCJE.targetOffset(2,-81).similar(0.9));
		scr.click(funkcje1);
		Thread.sleep(1000);
	}
}