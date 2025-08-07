package j5.j5_7.file;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// 간단한 디렉토리 구현
public class SimpleDirectory implements Directory {
    private String name;
    private String path;
    private Date createdDate;
    private Date modifiedDate;
    private List<FileSystemItem> items;

    public SimpleDirectory(String name, String path) {
        // TODO 101: 필드 초기화하기
        // name, path 설정
        // createdDate, modifiedDate는 현재 시간
        // items는 새 ArrayList
        this.name = name;
        this.path = path;
        this.createdDate = new Date();
        this.modifiedDate = new Date();
        this.items = new ArrayList<>();

    }

    @Override
    public String getName() {
        // TODO 102: name 반환하기
        return name;
    }

    @Override
    public long getSize() {
        // TODO 103: 모든 항목의 크기 합계 반환하기
        // items의 각 항목의 getSize() 합계
        long total = 0;
        for (FileSystemItem item : items) {
            total += item.getSize(); // TODO 103
        }
        return total;
    }

    @Override
    public Date getCreatedDate() {
        // TODO 104: createdDate 반환하기
        return createdDate;
    }

    @Override
    public Date getModifiedDate() {
        // TODO 105: modifiedDate 반환하기
        return modifiedDate;
    }

    @Override
    public String getPath() {
        // TODO 106: path 반환하기
        return path;
    }

    @Override
    public List<FileSystemItem> listItems() {
        // TODO 107: items의 복사본 반환하기
        // new ArrayList<>(items)
        return new ArrayList<>(items);
    }

    @Override
    public void addItem(FileSystemItem item) {
        // TODO 108: item 추가하고 modifiedDate 업데이트하기
        items.add(item);
        modifiedDate = new Date();
    }

    @Override
    public void removeItem(String name) {
        // TODO 109: name과 일치하는 항목 제거하기
        // items.removeIf() 사용
        // modifiedDate 업데이트
        items.removeIf(item -> item.getName().equals(name));
        modifiedDate = new Date();
    }

    @Override
    public FileSystemItem findItem(String name) {
        // TODO 110: name과 일치하는 항목 찾기
        // 없으면 null 반환
        for (FileSystemItem item : items) {
            if (item.getName().equals(name)) return item;
        }
        return null;
    }
}