package com.boot.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.boot.model.Shipwreck;

public class ShipwreckStub {
	private static Map<Integer, Shipwreck> wrecks = new HashMap<Integer, Shipwreck>();
	private static int idIndex = 3;

	//populate initial wrecks
	static {
		Shipwreck a = new Shipwreck(1, "U869", "A very deep German UBoat", "FAIR", 200, 44.12, 138.44, 1994);
		wrecks.put(1, a);
		Shipwreck b = new Shipwreck(2, "Thistlegorm", "British merchant boat in the Red Sea", "GOOD", 80, 44.12, 138.44, 1994);
		wrecks.put(2, b);
		Shipwreck c = new Shipwreck(3, "S.S. Yongala", "A luxury passenger ship wrecked on the great barrier reef", "FAIR", 50, 44.12, 138.44, 1994);
		wrecks.put(3, c);
	}

	public static List<Shipwreck> list() {
		return new ArrayList<Shipwreck>(wrecks.values());
	}

	public static Shipwreck create(Shipwreck wreck) {
		idIndex += idIndex;
		wreck.setId(idIndex);
		wrecks.put(idIndex, wreck);
		return wreck;
	}

	public static Shipwreck get(int id) {
		return wrecks.get(id);
	}

	public static Shipwreck update(int id, Shipwreck wreck) {
		wrecks.put(id, wreck);
		return wreck;
	}

	public static Shipwreck delete(int id) {
		return wrecks.remove(id);
	}
}
