package ciftbagli;

public class Liste {
	Cift head = null;
	Cift tail =  null;
	void basEkle(int x) {
		Cift eleman = new Cift(x);
		if (head ==null ) {
			head = eleman;
			tail = eleman;
			System.out.println("Eleman yok diye başa ekledim");
		}
		else {
			eleman.next = head;
			head.prev = eleman;
			head = eleman;
			System.out.println("Başa ekledim");
		}
	}
	void sonEkle(int x) {
		Cift eleman2 = new Cift(x);
		if (head ==null ) {
			head = eleman2;
			tail = eleman2;
			System.out.println("Eleman yok diye başa ekledim");
		}
		else {
			tail.next = eleman2;
			eleman2.prev = tail;
			tail = eleman2;
			System.out.println("Sona Ekledim");
		}
	}
	void yazdir() {
		Cift ref = head;
		while (ref != null) {
			System.out.println("---------->" + ref.veri);
			ref = ref.next;
		}
	}
	void tersYazdir() {
		Cift ref2 = tail;
		while (ref2 != null) {
			System.out.println("---------->" + ref2.veri);
			ref2 = ref2.prev;		
			}
	}
	void basSil () {
		Cift ref3 = head;
		int i = 0;
		while (i<1) {
			ref3 = ref3.next;
			i++;
		}
		head = ref3;
		ref3.prev = null;
		ref3.next = head.next;

	}
}
