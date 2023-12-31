package animals;

import java.io.Serializable;

public interface Writable {
    boolean saveToFile(Serializable serializable, String filePath);
    Object loadFromFile(String filePath);
}
