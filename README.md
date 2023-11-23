# Spring Boot - Azure DevOps 

This repository provides a quick guide on how to set up and run a pipeline in Azure DevOps of a Spring Boot project

## Index

1. [Prerequisites](#prerequisites)
2. [Local Execution](#local-execution)
3. [Azure DevOps Config](#azure-devops-configuration)


## Prerequisites

You must have the following:

- Java 8 or higher 
- Maven
- Code editor of your choice.
- Azure DevOps Account

## Local Execution

To run the application locally, follow these steps:

1. Clones the repository:

    ```bash
    git clone https://github.com/danilonunezgil/Spring-Boot-Azure-DevOps.git
    ```

2. Navigate to the project directory:

    ```bash
    cd Spring-Boot-Azure-DevOps
    ```

3. Run the application:

    ```bash
    ./mvnw spring-boot:run
    ```

4. The application will be available at 
   ```bash
   [http://localhost:8080/home](http://localhost:8080/home)
   ```

## Azure DevOps Configuration

1. Create a new project in Azure DevOps

![New project](docs/step1-create-new-project.png)

2. In "Repos" of Azure DevOps import the GitHub repository [repository-example](https://github.com/danilonunezgil/Spring-Boot-Azure-DevOps.git)

![Import Repository](docs/step2-import-repository.png)

3. Create pipeline to the Spring Boot project

![Create pipeline 1](docs/step3-create-pipeline-1.png)

![Create pipeline 2](docs/step3-create-pipeline-2.png)

![Create pipeline 3](docs/step3-create-pipeline-3.png)

![Create pipeline 4](docs/step3-create-pipeline-4.png)

4. Run the pipeline


5. Modify the azure-pipelines.yml as necessary

![Modify azure-pipelines file](docs/step4-modify-pipeline.png)

6. Add Azure App Service Deploy

![Add Azure App Service Deploy](docs/step5-add-azure-service.png)

7. Run again the pipeline


8. Verify the program deployed

![View App Deployed](docs/step6-app-deploy.png)

8. Make a change in the code to view in the deploy


8. Upload the change to the main branch


9. Verify changes made to the deployment
