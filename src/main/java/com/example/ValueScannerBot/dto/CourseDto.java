package com.example.ValueScannerBot.dto;

import com.google.gson.annotations.SerializedName;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;


@Data
@NoArgsConstructor
@Entity
@Table(name = "Course")
public class CourseDto implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @SerializedName("asses_id")
    private String asset_id;
    @SerializedName("name")
    private String name;
    @SerializedName("price_usd")
    private String price_usd;




}
