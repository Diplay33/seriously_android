package view.nav_screen_routes

sealed class StartScreenRoutes(val route: String) {
    data object StartView: StartScreenRoutes(route = "start_view")
    data object SignInView: StartScreenRoutes(route = "sign_in_view")

    fun withArgs(vararg args: String): String {
        return buildString {
            append(route)
            args.forEach { arg ->
                append("/$arg")
            }
        }
    }
}