package com.codandotv.streamplayerapp.feature_profile.profile.data.model

@Suppress("ConstructorParameterNaming")
data class ProfileStreamResponse(
    val id: String,
    val name: String,
    val profile_url: String,
)

data class ProfilesResponse(
    val profiles: List<ProfileStreamResponse>
)