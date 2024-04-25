package view.nav_screen_routes

sealed class StartScreenRoutes(val route: String) {
    object StartView: StartScreenRoutes(route = "start_view")

    fun withArgs(vararg args: String): String {
        return buildString {
            append(route)
            args.forEach { arg ->
                append("/$arg")
            }
        }
    }
}