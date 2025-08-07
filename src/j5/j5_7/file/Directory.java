package j5.j5_7.file;

import java.util.List;

// 디렉토리 인터페이스
public interface Directory extends FileSystemItem {
    List<FileSystemItem> listItems();
    void addItem(FileSystemItem item);
    void removeItem(String name);
    FileSystemItem findItem(String name);
}