package models;

import com.fasterxml.jackson.annotation.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "name",
        "job",
        "id",
        "createdAt"
})

public class CreateUserMap {

    @JsonProperty("name")
    private String name;
    @JsonProperty("job")
    private String job;
    @JsonProperty("id")
    private int id;
    @JsonProperty("createdAt")
    private String createdAt;

    public String getName() { return name;}
    public void setName(String name) { this.name = name; }

    public String getJob() { return job;}
    public void setJob(String job) { this.job = job; }

    public int getId() { return id; }
    public void setId(int id) { this.id = id;}

    public String getCreatedAt() { return createdAt;}
    public void setCreatedAt(String createdAt) { this.createdAt = createdAt; }
}


