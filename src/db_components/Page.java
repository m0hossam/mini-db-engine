package db_components;

import db_components.Row;

import java.io.Serializable;
import java.util.Vector;

public class Page implements Serializable {
    public Vector<Row> rows;
}
