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
//    @SerializedName("time")
    private String time;
//    @SerializedName("asset_id_base")
    private String asset_id_base;
//    @SerializedName("asset_id_quote")
    private String asset_id_quote;

//    @SerializedName("rate")
    private String rate;




}
