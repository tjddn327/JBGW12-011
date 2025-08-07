package j5.j5_7.file;

import java.nio.charset.StandardCharsets;
import java.util.Date;

// 텍스트 파일 구현
public class TextFile implements File {
    private String name;
    private String content;
    private Date createdDate;
    private Date modifiedDate;
    private String path;

    public TextFile(String name, String path) {
        // TODO 88: 필드 초기화하기
        // name, path 설정
        // content는 빈 문자열
        // createdDate, modifiedDate는 현재 시간
        this.name = name;
        this.path = path;
        this.content = "";
        this.createdDate = new Date();
        this.modifiedDate = new Date();
    }

    @Override
    public String getName() {
        // TODO 89: name 반환하기
        return name;
    }

    @Override
    public long getSize() {
        // TODO 90: content의 바이트 크기 반환하기
        // content.getBytes().length
        return content.getBytes(StandardCharsets.UTF_8).length;
    }

    @Override
    public Date getCreatedDate() {
        // TODO 91: createdDate 반환하기
        return createdDate;
    }

    @Override
    public Date getModifiedDate() {
        // TODO 92: modifiedDate 반환하기
        return modifiedDate;
    }

    @Override
    public String getPath() {
        // TODO 93: path 반환하기
        return path;
    }

    @Override
    public String getExtension() {
        // TODO 94: 파일 확장자 반환하기
        // name에서 마지막 '.' 이후 문자열
        // '.'이 없으면 빈 문자열
        int dotIndex = name.lastIndexOf(".");
        return (dotIndex >= 0) ? name.substring(dotIndex + 1) : "";
    }

    @Override
    public String getMimeType() {
        // TODO 95: "text/plain" 반환하기
        return "text/plain";
    }

    @Override
    public byte[] read() {
        // TODO 96: content를 바이트 배열로 반환하기
        return content.getBytes(StandardCharsets.UTF_8);
    }

    @Override
    public String readAsString() {
        // TODO 97: content 반환하기
        return content;
    }

    @Override
    public void write(byte[] data) {
        // TODO 98: data를 문자열로 변환하여 content에 저장하기
        // modifiedDate 업데이트
        this.content = new String(data, StandardCharsets.UTF_8);
        this.modifiedDate = new Date();
    }

    @Override
    public void writeString(String content) {
        // TODO 99: content 저장하고 modifiedDate 업데이트하기
        this.content = content;
        this.modifiedDate = new Date();
    }

    @Override
    public void append(byte[] data) {
        // TODO 100: data를 문자열로 변환하여 content에 추가하기
        // modifiedDate 업데이트
        this.content += new String(data, StandardCharsets.UTF_8);
        this.modifiedDate = new Date();
    }
}