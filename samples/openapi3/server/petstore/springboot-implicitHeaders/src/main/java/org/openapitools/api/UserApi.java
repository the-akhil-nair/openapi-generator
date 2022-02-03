/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (6.0.0-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import java.util.List;
import java.time.OffsetDateTime;
import org.openapitools.model.User;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
@Validated
@Tag(name = "user", description = "the user API")
public interface UserApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /user : Create user
     * This can only be done by the logged in user.
     *
     * @param body Created user object (required)
     * @return successful operation (status code 200)
     */
    @Operation(
        operationId = "createUser",
        summary = "Create user",
        tags = { "user" },
        responses = {
            @ApiResponse(responseCode = "200", description = "successful operation")
        }
    )
    @Parameters({
    })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/user"
    )
    default ResponseEntity<Void> createUser(
        @Parameter(name = "body", description = "Created user object", required = true, schema = @Schema(description = "")) @Valid @RequestBody User body
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /user/createWithArray : Creates list of users with given input array
     *
     * @param body List of user object (required)
     * @return successful operation (status code 200)
     */
    @Operation(
        operationId = "createUsersWithArrayInput",
        summary = "Creates list of users with given input array",
        tags = { "user" },
        responses = {
            @ApiResponse(responseCode = "200", description = "successful operation")
        }
    )
    @Parameters({
    })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/user/createWithArray"
    )
    default ResponseEntity<Void> createUsersWithArrayInput(
        @Parameter(name = "body", description = "List of user object", required = true, schema = @Schema(description = "")) @Valid @RequestBody List<User> body
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /user/createWithList : Creates list of users with given input array
     *
     * @param body List of user object (required)
     * @return successful operation (status code 200)
     */
    @Operation(
        operationId = "createUsersWithListInput",
        summary = "Creates list of users with given input array",
        tags = { "user" },
        responses = {
            @ApiResponse(responseCode = "200", description = "successful operation")
        }
    )
    @Parameters({
    })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/user/createWithList"
    )
    default ResponseEntity<Void> createUsersWithListInput(
        @Parameter(name = "body", description = "List of user object", required = true, schema = @Schema(description = "")) @Valid @RequestBody List<User> body
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * DELETE /user/{username} : Delete user
     * This can only be done by the logged in user.
     *
     * @param username The name that needs to be deleted (required)
     * @return Invalid username supplied (status code 400)
     *         or User not found (status code 404)
     */
    @Operation(
        operationId = "deleteUser",
        summary = "Delete user",
        tags = { "user" },
        responses = {
            @ApiResponse(responseCode = "400", description = "Invalid username supplied"),
            @ApiResponse(responseCode = "404", description = "User not found")
        }
    )
    @Parameters({
    })
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/user/{username}"
    )
    default ResponseEntity<Void> deleteUser(
        @Parameter(name = "username", description = "The name that needs to be deleted", required = true, schema = @Schema(description = "")) @PathVariable("username") String username
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /user/{username} : Get user by user name
     *
     * @param username The name that needs to be fetched. Use user1 for testing. (required)
     * @return successful operation (status code 200)
     *         or Invalid username supplied (status code 400)
     *         or User not found (status code 404)
     */
    @Operation(
        operationId = "getUserByName",
        summary = "Get user by user name",
        tags = { "user" },
        responses = {
            @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(mediaType = "application/json", schema = @Schema(implementation =  User.class))),
            @ApiResponse(responseCode = "400", description = "Invalid username supplied"),
            @ApiResponse(responseCode = "404", description = "User not found")
        }
    )
    @Parameters({
    })
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/user/{username}",
        produces = { "application/xml", "application/json" }
    )
    default ResponseEntity<User> getUserByName(
        @Parameter(name = "username", description = "The name that needs to be fetched. Use user1 for testing.", required = true, schema = @Schema(description = "")) @PathVariable("username") String username
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"password\" : \"password\", \"userStatus\" : 6, \"phone\" : \"phone\", \"id\" : 0, \"email\" : \"email\", \"username\" : \"username\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/xml"))) {
                    String exampleString = "<User> <id>123456789</id> <username>aeiou</username> <firstName>aeiou</firstName> <lastName>aeiou</lastName> <email>aeiou</email> <password>aeiou</password> <phone>aeiou</phone> <userStatus>123</userStatus> </User>";
                    ApiUtil.setExampleResponse(request, "application/xml", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /user/login : Logs user into the system
     *
     * @param username The user name for login (required)
     * @param password The password for login in clear text (required)
     * @return successful operation (status code 200)
     *         or Invalid username/password supplied (status code 400)
     */
    @Operation(
        operationId = "loginUser",
        summary = "Logs user into the system",
        tags = { "user" },
        responses = {
            @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(mediaType = "application/json", schema = @Schema(implementation =  String.class))),
            @ApiResponse(responseCode = "400", description = "Invalid username/password supplied")
        }
    )
    @Parameters({
    })
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/user/login",
        produces = { "application/xml", "application/json" }
    )
    default ResponseEntity<String> loginUser(
        @NotNull @Parameter(name = "username", description = "The user name for login", required = true, schema = @Schema(description = "")) @Valid @RequestParam(value = "username", required = true) String username,
        @NotNull @Parameter(name = "password", description = "The password for login in clear text", required = true, schema = @Schema(description = "")) @Valid @RequestParam(value = "password", required = true) String password
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /user/logout : Logs out current logged in user session
     *
     * @return successful operation (status code 200)
     */
    @Operation(
        operationId = "logoutUser",
        summary = "Logs out current logged in user session",
        tags = { "user" },
        responses = {
            @ApiResponse(responseCode = "200", description = "successful operation")
        }
    )
    @Parameters({
    })
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/user/logout"
    )
    default ResponseEntity<Void> logoutUser(
        
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /user/{username} : Updated user
     * This can only be done by the logged in user.
     *
     * @param username name that need to be deleted (required)
     * @param body Updated user object (required)
     * @return Invalid user supplied (status code 400)
     *         or User not found (status code 404)
     */
    @Operation(
        operationId = "updateUser",
        summary = "Updated user",
        tags = { "user" },
        responses = {
            @ApiResponse(responseCode = "400", description = "Invalid user supplied"),
            @ApiResponse(responseCode = "404", description = "User not found")
        }
    )
    @Parameters({
    })
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/user/{username}"
    )
    default ResponseEntity<Void> updateUser(
        @Parameter(name = "username", description = "name that need to be deleted", required = true, schema = @Schema(description = "")) @PathVariable("username") String username,
        @Parameter(name = "body", description = "Updated user object", required = true, schema = @Schema(description = "")) @Valid @RequestBody User body
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
