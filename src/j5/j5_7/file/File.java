package j5.j5_7.file;

// 파일 인터페이스
public interface File extends FileSystemItem, Readable, Writable {
    String getExtension();
    String getMimeType();
}