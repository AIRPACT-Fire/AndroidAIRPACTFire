package edu.wsu.lar.airpact_fire.data.model;

import java.util.List;
import io.realm.RealmObject;

public class App extends RealmObject {

    public List<User> users;
}