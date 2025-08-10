package j9.j9_4;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileSystemTree {

    static class FileNode {
        String name;
        boolean isDirectory;
        long size;
        List<FileNode> children;

        FileNode(String name, boolean isDirectory) {
            this.name = name;
            this.isDirectory = isDirectory;
            this.children = new ArrayList<>();
        }
    }

    // 디렉토리를 트리로 변환
    public static FileNode buildFileTree(String path) {
        File file = new File(path);
        return buildFileTreeHelper(file);
    }

    private static FileNode buildFileTreeHelper(File file) {
        if (!file.exists()) return null;
        FileNode node = new FileNode(file.getName(), file.isDirectory());

        if (file.isDirectory()) {
            File[] files = file.listFiles();
            if (files != null) {
                for (File child : files) {
                    node.children.add(buildFileTreeHelper(child));
                }
            }
        } else {
            node.size = file.length();
        }

        return node;
    }

    // 트리 형태로 출력
    public static void printFileTree(FileNode node, String indent) {
        if (node == null) return;
        System.out.println(indent + (node.isDirectory ? "└── [D] " : "└── [F] ") +
                node.name + (node.isDirectory ? "" : " (" + node.size + " bytes)"));

        for (int i = 0; i < node.children.size(); i++) {
            printFileTree(node.children.get(i), indent + "    ");
        }
    }

    // 특정 확장자의 파일 찾기
    public static List<String> findFilesByExtension(FileNode root, String extension) {
        List<String> result = new ArrayList<>();
        if (root != null) {
            findFilesByExtensionHelper(root, extension, "", result);
        }
        return result;
    }

    private static void findFilesByExtensionHelper(FileNode node, String extension,
                                                   String path, List<String> result) {
        String currentPath = path.isEmpty() ? node.name : path + File.separator + node.name;

        if (!node.isDirectory && node.name.endsWith(extension)) {
            result.add(currentPath);
        }

        for (FileNode child : node.children) {
            findFilesByExtensionHelper(child, extension, currentPath, result);
        }
    }

    // 디렉토리 크기 계산
    public static long calculateSize(FileNode node) {
        if (node == null) return 0;
        if (!node.isDirectory) {
            return node.size;
        }

        long totalSize = 0;
        for (FileNode child : node.children) {
            totalSize += calculateSize(child);
        }

        node.size = totalSize;  // 캐싱
        return totalSize;
    }
}