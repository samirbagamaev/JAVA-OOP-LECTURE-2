package WORK.program6.Interface;

import WORK.program6.Document.TextDocument;

public interface Saveable {
    void SaveAs(TextDocument document, String path);
}
