package sg.darren.ms.file.rename.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

@Entity
@Table(name = "tbl_scan")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ScanEntity {

    @JsonIgnore
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "path")
    private String path;

    @Column(name = "folder")
    private String folder;

    @Column(name = "file_name")
    private String fileName;

    @Column(name = "duplicate")
    private String duplicate;

    @Column(name = "duplicate_with")
    private String duplicateWith;

    @Temporal(TemporalType.TIMESTAMP)
    @CreationTimestamp
    @Column(name = "created_on", updatable = false)
    private Date createdOn;

    @Temporal(TemporalType.TIMESTAMP)
    @UpdateTimestamp
    @Column(name = "updated_on")
    private Date updatedOn;

}
