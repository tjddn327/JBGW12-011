package j5.j5_7.file;

import java.util.*;

/**
 * 파일 시스템을 위한 인터페이스 설계
 */
// 파일 시스템 항목
public interface FileSystemItem {
    String getName();
    long getSize();
    Date getCreatedDate();
    Date getModifiedDate();
    String getPath();
}