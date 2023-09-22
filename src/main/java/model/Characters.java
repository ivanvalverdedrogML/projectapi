package model;


import lombok.Getter;

@Getter
@lombok.AllArgsConstructor
public record Characters(String id, String name, String status, String species, String type, String gender) {}
