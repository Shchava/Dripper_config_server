package com.drippserver.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode

@Entity
public class Target {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idTarget;

    @Column(nullable = false)
    String address;

    @Column
    Integer port;

    @Column
    String protocol;

    @Column(nullable = false)
    Integer priority;
}
