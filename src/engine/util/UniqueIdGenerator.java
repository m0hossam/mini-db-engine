package engine.util;

import engine.exceptions.DBAppException;
import engine.exceptions.MaxPagesException;

public final class UniqueIdGenerator {
    private static long id = 0;

    private UniqueIdGenerator() {}

    public static long acquireId() throws MaxPagesException {
        if (id == Long.MAX_VALUE) {
            throw new MaxPagesException("DBApp cannot create any more pages!");
        }
        return id++;
    }
}
