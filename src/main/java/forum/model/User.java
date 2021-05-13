package forum.model;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.validation.constraints.Size;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;

public class User implements UserDetails {

    private long id;

    @Size(min = 2, message = "Не меньше 5 знаков")
    private String password;

    @Size(min = 2, message = "Не меньше 5 знаков")
    private String username;
    private String email;


    private boolean enabled;

    private Set<Role> roles;

    public Set<Role> getRoles() {
        return roles;
    }

    public User(String password, String username, String email) {
        this.password = password;
        this.username = username;
        this.email = email;
    }

    public User() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return getRoles();
    }

    public String getPassword() {
        return password;
    }


    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return password.equals(user.password) && username.equals(user.username) && email.equals(user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(password, username, email);
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
}
