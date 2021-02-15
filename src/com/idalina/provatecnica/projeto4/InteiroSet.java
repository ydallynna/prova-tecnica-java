package com.idalina.provatecnica.projeto4;

import java.util.Arrays;

public class InteiroSet {

	private static final int MIN = 0;
	private static final int MAX = 100;
	public boolean[] a;

	public InteiroSet() {
		a = new boolean[MAX + 1];
	}

	// UNION
	public static InteiroSet union(InteiroSet conjunto01, InteiroSet conjunto02) {
		InteiroSet result = new InteiroSet();
		for (int i = 0; i <= MAX; ++i) {
			result.a[i] = conjunto01.a[i] | conjunto02.a[i];
		}
		return result;
	}

	// INTERSECCAO
	public static InteiroSet interseccao(InteiroSet conjunto01, InteiroSet conjunto02) {
		InteiroSet result = new InteiroSet();
		for (int i = 0; i <= MAX; ++i) {
			result.a[i] = conjunto01.a[i] & conjunto02.a[i];
		}
		return result;
	}

	// INSERE ELEMENTO
	public void insereElemento(int i) {
		a[i] = true;
	}

	// DELETE ELEMENTO
	public void deleteElemento(int i) {
		a[i] = false;
	}

	// toSETSTRING
	public String toSetString() {
		StringBuffer conc = new StringBuffer();
		for (int i = 0; i <= MAX; ++i) {
			if (a[i])
				conc.append(i).append(",");
			else
				conc.append("-").append(",");
		}
		return conc.toString();
	}

	// EhIGUALTO
	public static boolean ehIgualTo(InteiroSet conjunto01, InteiroSet conjunto02) {
		return Arrays.equals(conjunto01.a, conjunto02.a);
	}

	@Override
	public String toString() {
		return Arrays.toString(this.a);

	}

}
